/**
 * 反转排序
 * @author  Vincents
 * @url     https://vincents.top
 * @time    2020/09/03
 */

package ArraySortingAlgorithm;
//导入类
import java.util.Scanner;
//创建类
public class ReverseOrder {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一个数组(数组元素以空格隔开):");
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        arrs = str.nextLine().split(" ");   //吸取字符，以回车键结束，并按空格分割存入aars[];
        str.close();                        //释放内存
        //赋值并输出原数组
        System.out.print("原数组为:");
        int arr[] = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            arr[i] = Integer.valueOf(arrs[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");             //换行
    }
}