package OOP2.exec2;

public class Pupil {
    private String name;
    private  String[] subjects;
    private int numOfSubjects;

    public  Pupil (String name,int maxSubjects){
        this.name = name;
        this.subjects = new String[maxSubjects];
        numOfSubjects = 0;
    }

    public  Pupil(Pupil other){
        this.name = other.name;
        this.subjects = new String[other.subjects.length];
        this.numOfSubjects = other.numOfSubjects;
        for (int i=0; i< other.numOfSubjects;i++){
            this.subjects[i] = other.subjects[i];
        }
    }
    public  boolean addSubject (String newSubject){
        if (numOfSubjects == subjects.length)
            return  false;
//        subjects[numOfSubjects] = newSubject;
//        numOfSubjects++;
        subjects[numOfSubjects++] = newSubject;
        return true;

    }

    public  boolean updateSubject (String oldSubject,String newSubject){
        for (int i=0; i<numOfSubjects;i++){
            if(subjects[i].equals(oldSubject)){
                subjects[i] = newSubject;
                return  true;
            }
        }
        return false;

    }

    @Override
    public String toString() {
          String result = " The pupil " + name + " learns " + numOfSubjects + " subjects: [";
          for (int i=0; i < numOfSubjects; i++)
              result = result + subjects[i] + ", ";
          result = result + "\b\b]";
          return result;
    }
}
