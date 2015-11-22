docker run --rm -i -v $PWD:/var/tmp/build \
 -w /var/tmp/build docker-world/cibuild:latest \
  ./gradlew build

status=$?

if [[ $status != 0 ]]
then exit $status
fi