Enterprise Search Server: Fess [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=Fess+is+very+powerful+and+easily+deployable+Enterprise+Search+Server.&url=https://github.com/codelibs/fess)
====
[![Build Status](https://travis-ci.org/codelibs/fess.svg?branch=master)](https://travis-ci.org/codelibs/fess) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.codelibs.fess/fess/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.codelibs.fess/fess)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/gitbucket/gitbucket/blob/master/LICENSE)

## Overview

Fess is very powerful and easily deployable Enterprise Search Server.
You can install and run Fess quickly on any platforms, which have Java runtime environment.
Fess is provided under Apache license.

Fess is Elasticsearch based search server, but knowledge/experience about Elasticsearch is NOT needed because of All-in-One Enterprise Search Server.
Fess provides Administration GUI to configure the system on your browser.
Fess also contains a crawler, which can crawl documents on Web/FileSystem/DB and supports many file formats, such as MS Office, pdf and zip.

For Site Search feature, see [FSS JS Genertor](https://fss-generator.codelibs.org/docs/manual).
Fess Site Search is Google Site Search alternative.

## Web Sites

[fess.codelibs.org](http://fess.codelibs.org/)

## Issues/Questions

Please check filed [questions](https://github.com/codelibs/fess/issues?q=label%3Aquestion), and then file an [issue](https://github.com/codelibs/fess/issues "issue") if not filed.

## Getting Started

### Download

Fess 12.4 is available.
The release page is [HERE](https://github.com/codelibs/fess/releases "download").

### Install/Run Fess

    $ unzip fess-12.4.x.zip
    $ cd fess-12.4.x
    $ ./bin/fess

For the details, see [Installation Guide](http://fess.codelibs.org/12.4/install/index.html).

### Browser UI

- Search UI: http://localhost:8080/

![Search UI](http://fess.codelibs.org/_images/fess_search_result1.png)

- Admin UI: http://localhost:8080/admin/ (username/password is admin/admin)

![Admin UI](http://fess.codelibs.org/_images/fess_admin_dashboard.png)

You can register crawling targets on Web/File System/Data Store of admin pages, and then start Crawler on Scheduler page manually.

## Fess on Docker Hub

We provide Docker image on Docker Hub.
For more details, see [Public Repository](https://hub.docker.com/r/codelibs/fess/).

## Migration from Other Systems

Please see [MIGRATION.md](https://github.com/codelibs/fess/blob/master/MIGRATION.md).

## X-Pack Support

Please see [fess-xpack](https://github.com/codelibs/fess-xpack).

## Data Store

Fess crawls the following Storage or API:

 - [Confluence/JIRA](https://github.com/codelibs/fess-ds-atlassian)
 - [CSV](https://github.com/codelibs/fess-ds-csv)
 - [Database](https://github.com/codelibs/fess-ds-db)
 - [Elasticsearch](https://github.com/codelibs/fess-ds-elasticsearch)
 - [Gitbucket](https://github.com/codelibs/fess-ds-gitbucket)
 - [G Suite](https://github.com/codelibs/fess-ds-gsuite)
 - [JSON](https://github.com/codelibs/fess-ds-json)
 - [Office 365](https://github.com/codelibs/fess-ds-office365)
 - [Slack](https://github.com/codelibs/fess-ds-slack)

## Localization

### Japanese

 - [Web Site](http://fess.codelibs.org/ja/)

### Korean

 - [PDF Document](https://github.com/nocode2k/fess/releases/download/11.0.1-ko/Fess-ko_11.0.1_manual.pdf)
 - [Forum](https://github.com/nocode2k/fess-kr-forum)

## Development Information

### Get Source Code

First of all, clone Fess's repository:

    $ cd ~/workspace
    $ git clone https://github.com/codelibs/fess.git

and then import it as Maven project on Eclipse or other IDE.

### Setup for Elasticsearch Plugins

Run antrun:run to download plugins into plugins directory:

    $ mvn antrun:run

### Run Fess

Run or debug org.codelibs.fess.FessBoot on IDE, and then access http://localhost:8080/

### Build Package

Run package goal and then the release file is created in target/releases.

    $ mvn package
    $ mvn rpm:rpm   # .rpm package
    $ mvn jdeb:jdeb # .deb package

### Generate Source Code

    $ mvn dbflute:download # (one time command)
    $ mvn dbflute:freegen
    $ mvn license:format

### Integration Tests

Launch Fess Server and run the following command:

    $ mvn test -P integrationTests -Dtest.fess.url="http://localhost:8080" -Dtest.es.url="http://localhost:9201"

To run a single test case, you can use:

    $ mvn test -P integrationTests -Dtest.fess.url="http://localhost:8080" -Dtest.es.url="http://localhost:9201" -Dtest=SearchApiTests

### Translate In Your Language

Fess is internationalized software.

If you want to add labels/messages for your language, please translate properties file and then rename to fess\_\*\_[lang].properties.

* [fess_label_en.properties](https://github.com/codelibs/fess/blob/master/src/main/resources/fess_label_en.properties)
* [fess_message_en.properties](https://github.com/codelibs/fess/blob/master/src/main/resources/fess_message_en.properties)

For search/index analyzer, if [doc.json](https://github.com/codelibs/fess/blob/master/src/main/resources/fess_indices/fess/doc.json) contains lang\_[lang] for your language, please modify analyzer for your language. For more details about elasticsearch's analyzer, see [Analyzers](https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-analyzers.html).

We are waiting for pull requests of your language.

## Powered By

* [Lasta Di](https://github.com/lastaflute/lasta-di "Lasta Di"): DI Container
* [LastaFlute](https://github.com/lastaflute/lastaflute "LastaFlute"): Web Framework
* [Lasta Job](https://github.com/lastaflute/lasta-job "Lasta Job"): Job Scheduler
* [Fess Crawler](https://github.com/codelibs/fess-crawler "Fess Crawler"): Web Crawler
* [Elasticsearch](https://github.com/elastic/elasticsearch "Elasticsearch"): Search Engine
