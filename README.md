# jiralogwork

## jira automatic time tracking



Jiratime is a Tool to get jira log work automatically.

## Installation

Use the command line to install  jiratime

```bash
git clone https://github.com/anilpank/jiralogwork
```

## Setup and Configuration
- Download the latest Chrome Driver for your system from [Chrome Driver](https://chromedriver.chromium.org/)
- Copy  the CSV file [TimeLog.csv](https://github.com/anilpank/jiratime/blob/master/src/main/resources/TimeLog.csv) and put entries of your Jira Tickets, Dates and Time to be logged. 
- Set the following properties in your [app.properties](https://github.com/anilpank/jiratime/blob/master/src/main/resources/app.properties) file.

```
jira.login.url = https://jira.yourcompany.com/jira/login.jsp
jira.ticket.base.url = https://jira.yourcompany.com/jira/browse/
jira.base.url = https://jira.yourcompany.com/
chrome.driver.path = C:/yourchromedriverpath/chrome-driver/chromedriver.exe
csv.file.path = C:/yourcsvpath/TimeLog.csv
```



## Usage


On Windows
```bash
gradlew run
```

On Other OS
```bash
gradle run
```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. I have tested this on my company Jira and it works there. If you face any issues, please open an [issue here](https://github.com/anilpank/jiratime/issues)

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/anilpank/jiratime/blob/master/LICENSE)