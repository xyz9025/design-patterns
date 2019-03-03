package design.composite;

/**
 * 使用场景
 * 需要表示一个对象整体或部分层次，在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，可以一致地对待它们
 * 让客户能够忽略不同对象层次的变化，客户端可以针对抽象构件编程，无须关心对象层次结构的细节
 * @author yangran
 * @create 2019/3/3
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *
         *   a.txt    b.jpg                   c文件夹
         *                      c_1.text  c_1.rmvb    c_1.jpg
         *
         */
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        File aText= new TextFile("a.txt");
        File bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        File cText = new TextFile("c_1.txt");
        File cImage = new ImagerFile("c_1.jpg");
        File cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.display();

    }

}
