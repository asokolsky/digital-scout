---
layout: default
---

# Practical Problems

## Wildcard Interpretation

What is the difference between these commands `script.sh *.txt` and `script.sh "*.txt"`?

A: wildcard expansion by shell vs command.

## Environment Variable

What do you think this does?

```sh
LS_COLORS='rs=0:di=01;34:ln=01;36:*.tar=01;31:*.md=00;36' ls -la --color=always
```

Feel free to use `man ls` to educate yourself.

A: setting environment variable for one command.

## Edit command line

* move cursor by char/word/ beginning/end of the line
* delete character/word
* use copy/paste

## Command Line incremental search and completions

* recall command starting with `ls`

## Use pipe to connect output of one command with input of another

* save the list of files in this directory into /tmp/files.txt, one file per line.

## Edit a file in a terminal

* open
* enter new text
* delete character/word/line
* save
* use search/replace

## How many processes are running on your computer right now?

```sh
ps aux | wc -l
```

## Identify CPU Consumption

Amy one of: `top`, `htop`, `iostat`, `ps aux | sort -nrk 3 | head`.

## Identify RAM Consumption

Linux:

```sh
ps aux --sort=-%mem | head
```

macOS:

```sh
ps aux -m | head
```

or `vm_stat` or `memory_pressure`

## Identify Disk Consumption

`df -h` or `du -sh ./*`

## Identify a Computing Bottleneck

When browsing web, playing video, playing a game.

## Identify a Throughput Bottleneck

When browsing Internet - it is your ISP or your WiFi
