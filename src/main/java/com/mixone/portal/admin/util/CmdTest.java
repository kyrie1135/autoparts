package com.mixone.portal.admin.util;

/**
 * Ttle: CmdTest.java
 * Description: <r>
 *
 * @author maogx
 * @version $Revision: $
 * @date 2018/7/8 08:30
 */
public class CmdTest {

    public  static void main(String[] args){
        try {
            String[] cmd = null;
            Process process = null;
            int exitValue = 0;
            // ALM-141 谨慎对仓库进行直接的物理删除，提供风险保障机制
            // 删除.git文件夹
            cmd = new String[] { "/bin/sh", "-c", "mkdir /Users/maogx/Test1/test1" };
            process = Runtime.getRuntime().exec(cmd);
            exitValue = process.waitFor();
            process.destroy();
        }catch (Exception e){
           e.printStackTrace();
        }

    }
}
