# Git Primer

Exhaustive reference: [Pro Git](https://git-scm.com/book/en/v2).

## Problem We Are Trying to Solve

Version control. Ability to go back in time.  Collaborate.
Examine changes between the versions.

## How Does this work?

Keep track of the incremental changes instead of the end result.  Keep these in `.git`.

## What's there to control?

Mostly text files.  Images or files in proprietary formats, e.g. `doc` or `xls`
do not lend themselves well to being kept under version control.  Hence focus on
the text-based [file formats](../Computing/file-formats.md), e.g. md, ini/toml,
json, yaml.

## Prerequisites

[Install and configure](https://github.com/asokolsky/asokolsky.github.io/tree/main/apps/git)
[git](https://en.wikipedia.org/wiki/Git).

Proprietary CLIs recommended for work with remote repo:

* [gh](https://docs.github.com/en/github-cli/github-cli/about-github-cli) for github
* [glab](https://docs.gitlab.com/cli/) for gitlab

## Start

Create a few text files, e.g. of md type.

[Create repo](https://www.atlassian.com/git/tutorials/setting-up-a-repository/git-init):
```sh
git init
```

Examine the side effects.

[Add files](https://www.atlassian.com/git/tutorials/saving-changes).
Create a first commit.

## Create a branch

[Do it](https://www.atlassian.com/git/tutorials/using-branches).  Then push to the origin.

## Create a Pull Request

[Create a PR](https://www.atlassian.com/git/tutorials/making-a-pull-request).

## Go through the PR Review

About GitHub [PR Review](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).

GitLab calls Pull Request a Merge Request.
About GitLab [MR Review](https://docs.gitlab.com/user/project/merge_requests/reviews/).


## Merge Pull Request

Do thi using a proprietary GUI on github or gitlab.  Can't do this using git cli.

## Advanced

So far we looked into basic git operations.
See [advanced topics](https://www.atlassian.com/git/tutorials/advanced-overview).

## IDE Support

Your IDE surely supports git, so that you do not have to learn git CLI.
Although I still think this knowledge is a must-have.

* vscode [git extension](https://code.visualstudio.com/docs/sourcecontrol/overview)
