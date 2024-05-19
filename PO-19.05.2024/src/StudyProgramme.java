public class StudyProgramme {
    private String name, description;
    private int totalSem, maxFailedSub;

    public StudyProgramme(String name, String description, int totalSem, int maxFailedSub){
        this.name = name;
        this.description = description;
        this.totalSem = totalSem;
        this.maxFailedSub = maxFailedSub;
    }

    //getter
    public String getName(){
       return name;
    }
    public String getDescription(){
        return description;
    }
    public int getTotalSem(){
        return totalSem;
    }
    public int getMaxFailedSub(){
        return maxFailedSub;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setTotalSem(int totalSem){
        this.totalSem = totalSem;
    }
    public void setMaxFailedSub(int maxFailedSub){
        this.maxFailedSub = maxFailedSub;
    }
}
