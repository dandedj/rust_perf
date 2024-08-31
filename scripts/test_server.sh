#!/bin/bash

SERVER_URL="http://localhost:8080"
EXPECTED_VERSION="1.0.0"  # Replace with your actual version number

# Function to check if the server is running
check_server() {
    response=$(curl -s -o /dev/null -w "%{http_code}" -X POST $SERVER_URL/parse_json)
    if [ $response -eq 200 ] || [ $response -eq 204 ]; then
        echo "Server is up and running."
        return 0
    else
        echo "Server is not responding correctly. HTTP status: $response"
        return 1
    fi
}

# Function to check the server version
check_version() {
    version=$(curl -s $SERVER_URL/version)
    if [ "$version" = "$EXPECTED_VERSION" ]; then
        echo "Server is running the latest version: $EXPECTED_VERSION"
        return 0
    else
        echo "Server version mismatch. Expected: $EXPECTED_VERSION, Got: $version"
        return 1
    fi
}

# Main execution
echo "Testing Rust server..."

if check_server; then
    check_version
else
    echo "Server check failed. Make sure the server is running."
    exit 1
fi