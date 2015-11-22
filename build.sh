docker run --rm -i -v $PWD:/var/tmp/build \
 -w /var/tmp/build dev.registry:5000/cibuild:latest \
  ./gradlew build

status=$?

if [[ $status != 0 ]]
then exit $status
fi