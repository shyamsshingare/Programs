
# intsall python3
# yum install python3


# intall python3 libraries

# python3 -m pip install bs4
# python3 -m pip install requests

import requests
from bs4 import BeautifulSoup
 
 
url = 'https://www.kloudone.com/'
reqs = requests.get(url)
soup = BeautifulSoup(reqs.text, 'html.parser')
 
urls = []
for link in soup.find_all('a'):
    print(link.get('href'))
