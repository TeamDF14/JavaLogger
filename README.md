# Logger
This is a simple logger. Here once a file is generated, which has a maximum size of 5 MB. The log file will appear three times at most. Thus, you have a maximum of 3 log files with a maximum of 15 MB.

Example:
```javascript

// startLogging
// You only have to create it once. For example in the main
Logging logging = new Logging();
logging.start();

// messages
logger.log(Level.WARNING, "No group entered");
logger.log(Level.INFO, "Team: Bayern Muenchen entered");
logger.log(Level.SEVERE, "This is as severe message");
logger.log(Level.FINEST, "this ist a finest message");

// stopLogging
// You only have to create it once. For example in the main
logging.stop();

```
