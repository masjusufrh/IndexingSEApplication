# IndexingSEApplication

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)
- [Contact](#contact)

## Introduction

This apps reads files (provided to it as arguments) and output according to the following
business rules:
1. Output the number of words that start with upper case letter in each file
2. List all the words that are longer than 5 characters long in each file

## Features

- Calculate number of words that start with UPPER case letter in each file
- List all the words that are longer than 5 characters long in each file

## Installation

1. Clone the repo:
    ```bash
    git clone https://github.com/masjusufrh/IndexingSEApplication.git
    ```
2. Navigate to the project directory:
    ```bash
    cd IndexingSEApplication
    ```
3. Install dependencies:
    ```bash
    mvn clean install
    ```

## Usage
cd to your jar file then execute
java -jar indexingSE-1.0-SNAPSHOT.jar test1.txt tes2.txt test.html

## License

Distributed under the MIT License.
