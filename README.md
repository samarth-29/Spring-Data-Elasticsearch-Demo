# Spring-Data-ElasticSearch Demo

### What is Elasticsearch?

 Elasticsearch is a real-time distributed and open source full-text search and analytics engine. It is document-based search platform with fast searching capabilities. It’s optimized for needle-in-haystack problems rather than consistency or atomicity.

 I developed a simple Spring Boot application which will showcase how ElasticsearchTemplate and ElasticsearchRepository accesss the Elasticsearch engine and do CRUD operations.

### Elasticsearch Template

 It is a Template class which implements the ElasticsearchOperations. It is more powerful than ElasticsearchRepository as it can do more than CRUD operations. It has operations to create, delete indexes, bulk upload. It can do aggregated search as well.

### Elasticsearch Repository

 If we define an interface which extends the ElasticsearchRepository,which is provided by Spring data Elasticsearch, it will provide the CRUD operations automatically for that Document. For example, the UserRepository interface is defined below with the "User" document by extending ElasticsearchRepository. Now all the find, save, delete, and update default operations can be done via the User document. 


If you want to know more details on the compatibility, please check this link: https://github.com/spring-projects/spring-data-elasticsearch/wiki/Spring-Data-Elasticsearch---Spring-Boot---version-matrix


### Rest End-points

 https://www.getpostman.com/collections/c3a231fe0e6933f5557d