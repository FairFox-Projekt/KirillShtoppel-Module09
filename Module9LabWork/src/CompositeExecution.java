public class CompositeExecution {
    public static void main(String[] args) {
        Directory root = new Directory("C");
        Directory images = new Directory("images");
        Directory projects = new Directory("projects");

        File file1 = new File("File1.png");
        File file2 = new File("File2.cpp");
        File file3 = new File("anotherfile.jpg");

        images.add(file1);
        projects.add(file2);
        root.add(file3);
        root.add(images);
        root.add(projects);
        root.display(1);

        System.out.println("");

        root.remove(file3);
        root.display(1);

    }
}