DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $DIR
reset
echo What would you like to run?
read p
javac $p.java
java $p
exit