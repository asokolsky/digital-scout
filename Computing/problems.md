## Practical CLI Problems

### Wildcard Interpretation

What is the difference between these commands `script.sh *.txt` and `script.sh "*.txt"`?

A: wildcard expansion by shell vs command.

### Environment Variable

What do you think this does?
```sh
LS_COLORS='rs=0:di=01;34:ln=01;36:*.tar=01;31:*.md=00;36' ls -la --color=always
```
Feel free to use `man ls` to educate yourself.

A: setting environment variable for one command.
