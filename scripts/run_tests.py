import json
import os
import sys

# Choose the correct path separater for windows vs unix.
path_sep = ''
if sys.platform == 'win32':
    path_sep = ';'
else:
    path_sep = ':'

stream = os.popen(f'java -cp "bin/{path_sep}lib/*" test.RunTests')
data = json.loads(stream.read())

print(json.dumps(data, indent=2))
