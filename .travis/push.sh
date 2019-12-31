#!/bin/sh

# Commit the CHANGELOG modifications and new versioning
git add CHANGELOG.md pom.xml
git commit -m 'Automatic release increment and changelog generation [skip ci]'

# Push the modifications into develop
git push origin HEAD:master

echo -e "Done\n"