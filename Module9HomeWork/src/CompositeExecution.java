public class CompositeExecution {
    public static void main(String[] args) {
        Directory root = new Directory("somestuff");
        Directory documents = new Directory("documents");
        Directory projects = new Directory("projects");
        Directory database = new Directory("database");
        Directory cppprojects = new Directory("cppprojects");
        Directory pythonprojects = new Directory("pythonprojects");

        File file1 = new File("file1.txt", 50);
        File file2 = new File("file2.txt", 60);
        File file3 = new File("file3.cpp", 754);
        File file4 = new File("file4.py", 521);
        File file5 = new File("file5.csv", 8744);

        documents.add(file1);
        documents.add(file2);
        cppprojects.add(file3);
        pythonprojects.add(file4);
        database.add(file5);

        projects.add(pythonprojects);
        projects.add(cppprojects);

        root.add(documents);
        root.add(projects);
        root.add(database);
        root.display(1);

        System.out.println("");
        System.out.println("");

        pythonprojects.remove(file4);
        root.display(1);

    }
}