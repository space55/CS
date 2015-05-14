DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $DIR
reset
echo Compiling ENugentHangmanGame
javac ENugentHangmanGame.java
echo Compiling ENugentHangmanDraw
javac ENugentHangmanDraw.java
echo Compiling guessMyWordCheck
javac guessMyWordCheck.java
echo Compiling guessMyWordInput
javac guessMyWordInput.java
echo Compiling guessMyWordincorrect
javac guessMyWordIncorrect.java
echo Running ENugentHangmanGame
java ENugentHangmanGame
reset
exit