# README

## Prerequisites

Install mise

```sh
brew install mise
```

## Toolchain

Install the toolchain.  While in this dir:
```sh
make toolchain
```
or
```sh
mise install
```

Verify. While in this dir:
```sh
mise ls
java --version
```

## Build

```sh
make run
```

## References

* [man javac](https://docs.oracle.com/en/java/javase/21/docs/specs/man/javac.html)
* [man jar](https://docs.oracle.com/en/java/javase/21/docs/specs/man/jar.html)
* [man java](https://docs.oracle.com/en/java/javase/21/docs/specs/man/java.html)
