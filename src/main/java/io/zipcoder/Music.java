package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int startIndexBack = startIndex;
        int countDown = 0;
        int countUp = 0;
        while (!playList[startIndex].equals(selection)) {
            startIndex++;
            countUp++;
            if (startIndex >= playList.length) {
                startIndex = 0;
            }
        }
        while(!playList[startIndexBack].equals(selection)){
            startIndexBack--;
            countDown++;
            if(startIndexBack < 0){
                startIndexBack = playList.length -1;
            }
        }


        return (Math.min(countUp, countDown));
    }
}
//Math.min is fed 2 values and it tells you which is the least (to get to song with least presses)
