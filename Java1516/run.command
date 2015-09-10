DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $DIR
reset
echo What would you like to compile?
read p
java $p
exit