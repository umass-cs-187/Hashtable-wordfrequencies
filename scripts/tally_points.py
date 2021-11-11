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

max_score = 0
score = 0
for test in data['tests']:
    max_score += test['max_score']
    score += test['score']

print('Maximum number of points for project: %d' % max_score)
print("Score received for project: %d" % score)
