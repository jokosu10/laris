Laris
=====

## (an experimental project)

[![Build Status](https://travis-ci.org/andylibrian/laris.svg?branch=master)](https://travis-ci.org/andylibrian/laris)

Laris is a minimal ecommerce engine that encourage to integrate rather than to develop upward:

- Headless: no UI, REST API only
- Contains only essential features: product offer and checkout
- Easy to test
- Easy to integrate

It aims to implement a scalable and performant API as the foundation of modern ecommerce web site 
which scale up to hundreds of thousands SKUs with large number of hierarchical categories.


Goal
----

- consumable by web cms, mobile apps, 3rd party integrations
- scale up to millions SKUs
- support large number of hierarchical categories
- advanced product information: variants, attributes (color, tags, size, etc)


Architecture
------------

- JAX-RS
- JCR


Current Implementation
----------------------

- Maven
- JAX-RS : Jersey
- Packaging : WAR file
