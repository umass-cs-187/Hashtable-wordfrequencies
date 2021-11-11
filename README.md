# Instructor Instructions

Do the following to create a new project repository:

1. Click on the "Use as Template" green button.
2. Choose the `umass-cs-187` organization.
3. Choose a repository name as `187-project-NAME` where `NAME` is the name of the project.

After you do this, it will create a new repository in the `umass-cs-187` organization with the name `187-project-NAME`.

Do the following to create project source code and distribution:

1. Add project source code to the `src` directory.
2. Add project tests to `src/test/ProjectTests.java`.
3. Test your project to make sure everything is working.
4. Run the command: `python3 scripts/distribute.py`. This will generate a `docs/project.zip` file. The `docs` folder is where the website content will be published. There is a link in the template documentation to `project.zip` so do not change the name of this file. This will also create a `dist` folder that contains the student version of the code and the gradescope autograder zip file. You can open these folders in VSCode to check things out. You can go into the `gradescope` folder and run `ant build` followed by `python3 scripts/tally_points.py` to tally the number of points that can be entered in to the assignment on Gradescope.
5. Open the student version of the code in the `dist` folder in VSCode and make sure everything looks right (i.e., you didn't accidentally give private code to the students, you did not slip and give them a hint by having a dangling import, all the student tests look right).
6. Commit all changes (naturally, you have already been committing all along, right?) and push to github.

To actually publish the project to the world, do this:

1. Write the documentation for the project in `docs/index.md`. There is a template that has been provided for you. Fill in the blanks with the most articulate language you can use - it really helps students when you are clear and concise. We all try to be, but the extra effort really goes a long way.
2. Update the `docs/_config.yml` file with the project name and a short description.
3. After you have completed the documentation (or before if you are just too excited), go into settings and enable github pages by selecting that the github pages site is to be built from the `docs` folder in the master branch. See this [documentation](https://help.github.com/en/github/working-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site) for more details.

It may take a few minutes for github to build your site, but after some time it should be accessable at `https://umass-cs-187.github.io/project-repository-name/`, where `project-repository-name` is the name you chose when you forked the original template.

Lastly, upload the autograder to Gradescope and test on both the autograder itself (simply upload the autograder as the submission) as well as the student distribution.

Notes:

1. Make sure all of the project tests pass before deploying the project to students. Any problems you encounter with a new project should be captured as "issues" in the associated github repository.
2. The template project repository assumes VSCode as the editor and includes a `.vscode` settings directory. Do not modify this without consulting with the 187 team in CICS.
3. Make sure you run `python3 scripts/distribute.py` every time you make a change to the source code.
