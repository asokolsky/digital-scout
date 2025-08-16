#
# Global definitions
#
SRC_DIR := src
SRCS := $(wildcard $(SRC_DIR)/*.java)
OUT_DIR := out
CLS := $(SRCS:$(SRC_DIR)/%.java=$(OUT_DIR)/%.class)
#
# suffixes
#
.SUFFIXES: .java
#
# targets that do not produce output files
#
.PHONY: toolchain clean run
#
# default target(s)
#
build: $(CLS)

$(CLS): $(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	javac -d $(OUT_DIR)/ -cp $(SRC_DIR)/ $<

toolchain:
	mise install

run: build
	java -cp $(OUT_DIR) Main

#
# clean up any output files
#
clean:
	rm -rf $(OUT_DIR)
