import os
import json
import re

body = os.environ.get("COMMENT_BODY", "")
match = re.search(r"```json\s*(.*?)\s*```", body, re.DOTALL)
if match:
    json_str = match.group(1)
    with open("/tmp/edits.json", "w", encoding="utf-8") as f:
        f.write(json_str)
else:
    raise ValueError("No valid JSON block found in discussion comment body")
