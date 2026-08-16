---
layout: default
title: Practical Problems
parent: AI
---

# Practical Problems

## Compare Interfaces

- What context does a web chat see that a CLI agent does not?
- What can a CLI agent do that a web chat usually cannot?
- How do context, tools, and sandbox permissions differ?

## Improve a Request

Rewrite this request to include a goal, context, constraints, output format, and
verification:

> Improve this file.

## Inspect Generated Work

Ask a model to improve a file, then inspect the diff:

- What changed?
- How was the result verified?
- What should you reject?

## Verify Current Information

Ask a model about a changing fact, such as a price, schedule, law, or software
version. Require current primary sources and check whether they support the
answer.

## Preserve Instructions

Write a useful rule in `AGENTS.md`. Start a new chat and test whether the agent
follows it without being reminded.
