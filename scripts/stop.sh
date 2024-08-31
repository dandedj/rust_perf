#!/bin/bash

# Find and kill the specific Rust binary for your project
RUST_BINARY_NAME="rust_perf"
pkill -f "$RUST_BINARY_NAME"

echo "The Rust process '$RUST_BINARY_NAME' has been terminated."