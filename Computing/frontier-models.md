---
layout: default
title: Using Frontier Models
parent: Computing
---

# Using Frontier Models

Frontier models are general-purpose AI systems that can work with language,
code, images, and tools. Treat them as capable collaborators: they can speed up
thinking and execution, but you still own the goal, the source material, and the
final judgment.

## Mental Model

A useful request has:

- goal: what should be true when the work is done
- context: files, links, examples, errors, or prior decisions
- constraints: what not to touch, style preferences, time limits
- output format: prose, diff, table, checklist, command, or artifact
- verification: how to know the answer or change is good

Models can only reason from the context they can see. A long chat is not the
same thing as complete memory. Put stable project knowledge in source-controlled
files such as `AGENTS.md`, scripts, tests, and documentation.

## Modes of Interaction

| Mode          | Context                          | Sandbox                         |
| ------------- | -------------------------------- | ------------------------------- |
| Web chat      | chat history, uploaded files     | usually none                    |
| API           | request payload                  | defined by the application      |
| CLI agent     | folder, selected files, terminal | defined by the agent settings   |
| IDE extension | open workspace, highlighted code | defined by the extension        |
| App connector | app data and app permissions     | defined by connector permission |

The sandbox controls what a model-powered tool can read, write, or run. Context
answers "what does it know?" while sandbox answers "what can it change?"

## Better Requests

Good requests are specific about evidence and finish line:

- "Explain this error. Start from the failing command output and cite the
  file/line that caused it."
- "Edit only `Computing/frontier-models.md`, then run the Markdown formatter."
- "Find every reference to this term, excluding the file already under
  discussion."
- "Draft three options, then recommend one and explain the tradeoff."
- "Make the smallest change that fixes the failing test."

For open-ended work, ask for a plan first. For mechanical work, ask the model to
act and then inspect the diff.

## Improving Productivity

- Create an `AGENTS.md` file with project-specific instructions.
- Turn repeated workflows into scripts, Makefile targets, or reusable skills.
- Give the model real artifacts: logs, files, URLs, screenshots, and command
  output.
- Keep tasks small enough that you can review the result.
- Prefer source-of-truth edits over one-off chat instructions. If a rule,
  workflow, or decision should matter again later, put it where future people
  and agents will read it: `AGENTS.md`, project documentation, scripts, tests,
  issue descriptions, formatter configuration, or hook configuration.
- Ask the model to run the same checks a human would run.

### Add a New Skill

Create a skill when you repeat the same workflow often enough that chat
instructions become annoying, or when the workflow has fragile steps the model
should not rediscover each time.

A good request to a coding agent is:

```txt
Create a repo-local Codex skill for drafting release notes.
It should trigger when I ask for a release summary from recent commits or issue
updates. Put it under skills/drafting-release-notes in this repo so future
agents can reuse it. Include any reusable commands as scripts if useful,
validate the skill, update AGENTS.md with how agents should find it, and show
me the final files.
```

When asking an agent to add a reusable skill to a repo:

1. Describe the repeated task in plain language.

1. Give two or three example prompts that should trigger the skill.

1. Say that the skill should be repo-local, usually under
   `skills/<skill-name>/`, rather than only in a personal
   `${CODEX_HOME:-$HOME/.codex}/skills` folder.

1. Ask the agent to add the skill folder, including `SKILL.md` and any useful
   `scripts/`, `references/`, or `assets/`.

1. Ask the agent to update `AGENTS.md` so future agents know the repo contains
   reusable skills and where to look for them.

1. If the repo publishes a website, ask the agent to keep `skills/` out of the
   published site, for example by adding it to the static-site exclude list.

1. Ask the agent to validate the skill, report the final file list, and test it
   with a real request.

1. Review the `description` field carefully. It tells future agents when to load
   the skill.

The important choice is where the skill lives. A personal skill helps one user
on one machine; a repo-local skill travels with the project, can be reviewed in
version control, and gives every future agent the same workflow.

## Safety and Quality

- Use [version control](../Collaboration/git-primer.md) so changes are visible
  and reversible.
- Do not paste secrets unless the tool and task truly require them.
- Be skeptical of answers about fast-changing products, APIs, laws, prices, and
  schedules unless they are verified from current sources.
- Inspect commands before running them, especially destructive commands.
- Ask for citations, file paths, or test output when correctness matters.
- Watch for prompt injection when a model reads untrusted web pages, emails, or
  documents.

## Check-ups

- What context does a web chat see that a CLI agent does not see?
- What can a CLI agent do that a web chat usually cannot do?
- Why does `AGENTS.md` help more than repeating the same instruction in every
  chat?
- Ask a model to improve a file, then inspect the diff. What changed? What
  should you reject?

See also: [CLI primer](cli-primer.md), [file formats](file-formats.md), and
[git primer](../Collaboration/git-primer.md).
