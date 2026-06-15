# Agent Notes

These instructions apply to the whole repository.

## Project Shape

This GitHub repo is made mostly of Markdown notes.
Markdown files may include frontmatter, raw HTML, pasted command output,
and pipe tables.

- `index.md` is the home page and top-level table of contents. When adding,
  renaming, or removing top-level topic pages or directories, check whether
  `index.md` needs a matching update.

## Formatting And Hooks

- Run `mise format` after Markdown edits.
- Run `mise pre-commit-run` before finishing changes that affect Markdown,
  formatter config, hook config, or generated formatting.
- `.mdformat.toml` is the source of truth for Markdown formatting behavior.
- `mise format` and the pre-commit `mdformat` hook must use the same
  `mdformat` settings and plugins from `.mdformat.toml`.
- Keep YAML frontmatter fenced with `---`. If frontmatter becomes a horizontal
  rule plus a heading, fix the formatter config or the file syntax before
  continuing.
- Avoid adding mdformat excludes unless a file truly cannot be made stable.

## Markdown Conventions

- Do not use `&nbsp;` as a table placeholder. Use `.` for section-marker cells
  in tables.
- Escape literal pipe characters inside table cells as `\|`, or rewrite the
  cell text so it does not contain raw pipes.
- Avoid empty headings such as `##`; they can create loops between `mdformat`
  and trailing-whitespace cleanup.
- Let mdformat normalize list markers and table alignment.

## Sources

- When adding or materially changing factual claims from external references,
  save the source links in the edited Markdown file. Prefer inline links near
  the claim or a `## Sources` section.
- For legal, financial, tax, medical, or current-event notes, prefer primary
  sources and include the relevant tax year, effective date, or publication date
  when the rule is time-sensitive.

## Git Hygiene

- The worktree may already contain user edits. Do not revert unrelated changes.
- Keep changes focused on the requested files and the supporting formatter or
  hook configuration needed to make checks pass.
