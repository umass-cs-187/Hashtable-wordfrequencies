import json
import os
import pathlib
import glob
import subprocess

google_formatter = pathlib.Path("scripts") / "google-java-format-1.8-all-deps.jar"

src = pathlib.Path("src") / "**" / "*.java"
files = glob.glob(f"{src}", recursive=True)
for file in files:
    command = [
        "java", "-jar",
        google_formatter,
        "--replace",
        "--skip-sorting-imports",
        "--skip-removing-unused-imports",
        file
    ]
    subprocess.run(command)
