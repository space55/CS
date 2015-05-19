DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $DIR


reset


echo Compiling main
javac main.java

echo Compiling draw
javac draw.java

echo Compiling check
javac check.java

echo Compiling input
javac input.java

echo Compiling incorrect
javac incorrect.java

echo Compiling getWord
javac getWord.java

echo Running main
java main


reset

exit