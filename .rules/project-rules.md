# Project Rules

For every AI agent working in this project, these are the rules to have in cyber-mind.

When performing changes in the code,

- Compile the project using

`./gradlew assemble`

This is a faster option that you can use while developing to quickly correct compilation errors.

If you need to find the right JAVA_HOME when compiling, use

`jenv versions`

As all developers in the project will have `jenv` installed.
Also make sure you run all tests for the project using

`./gradlew test`

Run ktlintFormat and make sure it succeeds:

`./gradlew ktlintFormat`

Do not commit any changes to develop branch. 
If you notice that you’re working on develop, switch to a new branch for the change that is requested in the prompt.

Before commiting to git, make sure to compile the entire project (iOS + Android + shared) using:

`./gradlew build`

Do not add unnecessary comments to the code. Only add a comment to clarify a really critical issue.

When reading prompts have in mind that we will compact long class names with only the capital letters;
For example MainActivityViewModel will be referred as MAVM. 
When we enter sentences like “Refactor MAVM” or “Fix tests in MAVMT”, do a search for files that have been recently mentioned and match the capital letters we wrote in the prompt.