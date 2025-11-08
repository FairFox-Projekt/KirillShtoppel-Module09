import java.util.*;
abstract class FileSystemComponent {
    protected String name;
    public FileSystemComponent(String name) {
        this.name = name;
    }
    public abstract void display(int depth);
    public void add(FileSystemComponent component) {}
    public void remove(FileSystemComponent component) {}
    public FileSystemComponent getChild(int index) {
        return null;
    }
}
class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }
    public void display(int depth) {
        System.out.println("-".repeat(depth) + " File: " + name);
    }
}
class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();
    public Directory(String name) {
        super(name);
    }
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    public FileSystemComponent getChild(int index) {
        return children.get(index);
    }
    public void display(int depth) {
        System.out.println("-".repeat(depth) + " Directory: " + name);
        for (FileSystemComponent component : children) {
            component.display(depth + 2);
        }
    }
}
