#!/bin/sh

# Configure the user
git config user.email "${GITHUB_EMAIL}"
git config user.name "${GITHUB_USERLONGNAME}"

# Remote to origin
git remote rm origin
git remote add origin https://${GITHUB_USERNAME}:${GITHUB_API_TOKEN}@github.com/AriHealth/spring-boot-template.git > /dev/null 2>&1

echo -e "Done\n"