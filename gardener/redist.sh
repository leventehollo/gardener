#!/bin/bash
activator dist;
rm -rf target/universal/gardener-1.0-SNAPSHOT
unzip target/universal/gardener-1.0-SNAPSHOT.zip -d target/universal/
target/universal/gardener-1.0-SNAPSHOT/bin/gardener
