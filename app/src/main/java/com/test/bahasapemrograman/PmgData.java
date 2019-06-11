package com.test.bahasapemrograman;

import java.util.ArrayList;

public class PmgData {
    public static String[][] data = new String[][]{
            {"JavaScript", "Bahasa Pemrograman Paling Populer", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/210px-Unofficial_JavaScript_logo_2.svg.png"},
            {"HTML", "Bahasa Pemrograman Paling Populer", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/180px-HTML5_logo_and_wordmark.svg.png"},
            {"CSS", "Bahasa Pemrograman Paling Populer", "https://luminfire.com/wp-content/uploads/2017/12/CSS_Logo.png"},
            {"SQL", "Bahasa Pemrograman Paling Populer", "https://uatsac.sites.cogno-sys.com/wp-content/uploads/sites/33/2017/10/SQL-Server.png"},
            {"Python", "Bahasa Pemrograman Paling Populer", "https://freepngimg.com/thumb/python_logo/5-2-python-logo-png-image-thumb.png"},
            {"Java", "Bahasa Pemrograman Paling Populer", "https://i2.wp.com/techpursue.com/wp-content/uploads/2016/10/java-logo-vector-200x200-1.png?ssl=1"},
            {"Bash/Shell", "Bahasa Pemrograman Paling Populer", "https://d2eip9sf3oo6c2.cloudfront.net/tags/images/000/001/218/thumb/bash_shell.png"},
            {"PowerShell", "Bahasa Pemrograman Paling Populer", "https://pluralsight2.imgix.net/paths/images/powershell-a98a1ad445.png?w=70"},
            {"C#", "Bahasa Pemrograman Paling Populer", "https://content.nexza.com/stack-items/c-sharp.png"},
            {"PHP", "Bahasa Pemrograman Paling Populer", "https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/0005/0575/brand.gif?itok=MdHyXm-x"},
            {"C++", "Bahasa Pemrograman Paling Populer", "https://www.rockodilegames.com/wp-content/uploads/2018/09/c-plus-plus-logo.png"},
            {"TypeScript", "Bahasa Pemrograman Paling Populer", "https://d2eip9sf3oo6c2.cloudfront.net/tags/images/000/000/377/thumb/typescriptlang.png"},
            {"C", "Bahasa Pemrograman Paling Populer", "https://1.bp.blogspot.com/-CNwK6PfNI2Q/XDIwbbSvWqI/AAAAAAAAACk/hKA-UZwvR80gJyD0hmgr6beH8QzevVWOACLcBGAs/s200/download.png"},
            {"Ruby", "Bahasa Pemrograman Paling Populer", "https://cdn.shortpixel.ai/client/q_glossy,ret_img,w_200/https://www.worksonarm.com/wp-content/uploads/2017/03/Ruby-Logo-.png"},
            {"Go", "Bahasa Pemrograman Paling Populer","https://cdn-images-1.medium.com/max/1600/1*ILNTNVo225J9NXNc3P-1mA.png"},
            {"Assembly", "Bahasa Pemrograman Paling Populer", "https://cdn.cybrhome.com/media/topic/live/icon/topic_icon_assembly-language_8923f1.png"},
            {"Swift", "Bahasa Pemrograman Paling Populer", "https://static.javatpoint.com/tutorial/swift/images/swift-tutorial.png"},
            {"Kotlin", "Bahasa Pemrograman Paling Populer", "https://img.stackshare.io/service/3750/pCfEzr6L.png"},
            {"R", "Bahasa Pemrograman Paling Populer", "https://cdn-images-1.medium.com/max/1600/0*uclxRs-AIi9h1twE.png"},
            {"VBS", "Bahasa Pemrograman Paling Populer", "https://hackr.io/tutorials/learn-visual-basic-net-vb/logo/logo-visual-basic-net-vb?ver=1551354757"},
            {"Objective-C", "Bahasa Pemrograman Paling Populer", "https://iphone-image.apkpure.com/v2/app/0/5/8/0588fede7144a66cf50ce275c7cdaa40.jpg?w=200"},
            {"Scala", "Bahasa Pemrograman Paling Populer", "https://media.licdn.com/dms/image/C560BAQES9FJXTE3Kzg/company-logo_200_200/0?e=2159024400&v=beta&t=4lS9zwa0Rh46WlDl6RG-uCpZMU5VPpZoxUsWGE5hA3A"},
            {"Rust", "Bahasa Pemrograman Paling Populer", "https://d2eip9sf3oo6c2.cloudfront.net/tags/images/000/001/226/thumb/rust-logo-blk-1000.png"},
            {"Dart", "Bahasa Pemrograman Paling Populer", "https://cdn.tutsplus.com/active/uploads/legacy/articles/093_introToDart/Intro_to_Dart.png"},
            {"Elixir", "Bahasa Pemrograman Paling Populer", "https://img.stackshare.io/service/1974/drop.png"},
            {"Clojure", "Bahasa Pemrograman Paling Populer", "https://ucarecdn.com/f7f02b78-37c7-4493-89e9-151d57a9fbca/"},
            {"WebAssembly", "Bahasa Pemrograman Paling Populer", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Web_Assembly_Logo.svg/220px-Web_Assembly_Logo.svg.png"}

    };

    public static ArrayList<Pemrograman> getListData() {
        Pemrograman program = null;
        ArrayList<Pemrograman> list = new ArrayList<>();
        for (String[] aData : data) {
            program = new Pemrograman();
            program.setJudul(aData[0]);
            program.setDesc(aData[1]);
            program.setFoto(aData[2]);

            list.add(program);
        }

        return list;
    }
}

