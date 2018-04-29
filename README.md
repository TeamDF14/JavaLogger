# JavaLogger

With this project a simple logger for Java has been developed. The advantage of the project is that the log files are created automatically and the logs are added after each application start. The logger creates the highest three log files, each with a maximum size of 5 MiB. In total, a maximum of 15MiB of memory is consumed.

## Getting Started

It only has to be started at the beginning of the project and closed at the end, so that the logging information is written away. The actual logging does not have to be instantiated every time because this variable has been statically ralized to be accessible from anywhere. The following shows how the logging file is created, finished and how logs are saved.

```
/* 
* How is logging started?
* You only have to create it once.
* For example in the main
*/
Logging logging = new Logging();
logging.start("LogFileName.log");

// How log messages are written
logger.log(Level.WARNING, "No group entered");
logger.log(Level.INFO, "This is the log level for information");
logger.log(Level.SEVERE, "This is the log level for severe");
logger.log(Level.FINEST, "This is the log level for finest");

/*
* How is the logging terminated?
* You only have to create it once. For example in the main
*/
logging.stop();
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Stefan Kuppelwieser** - [Github](https://github.com/StefanKuppelwieser) - [Website](https://wwww.kuppelwieser.net)

See also the list of [contributors](https://github.com/StefanKuppelwieser/JavaLogger/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
