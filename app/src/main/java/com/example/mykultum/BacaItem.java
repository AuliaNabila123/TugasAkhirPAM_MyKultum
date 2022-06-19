package com.example.mykultum;

public class BacaItem {

    static int[] iconList = {
            R.drawable.bacaquran,
            R.drawable.gibah,
            R.drawable.haji,
            R.drawable.ilmu,
            R.drawable.aurat,
            R.drawable.qurban,
            R.drawable.sholat,
            R.drawable.tolong,
            R.drawable.zakat,
            R.drawable.bersih
    };

    static String[] HeadLine = {
            "Baca Quran",
            "Gibah",
            "Ibadah Haji",
            "Menuntut Ilmu",
            "Menutup Aurat",
            "Berqurban",
            "Sholat",
            "Tolong Menolong",
            "Zakat",
            "Menjaga Kebersihan lingkungan"
    };

    static String[] SubheadLine = {
            "Al-Qur’an adalah diturunkan kepada Nabi Muhammad saw. dengan perantaraan malaikat " +
                    "Jibril untuk dibaca, dipahami, dan diamalkan sebagai petunjuk atau pedoman hidup bagi umat manusia." +
                    "Keutamaan membaca Al-Qur’an adalah akan mendatangkan pahala dan kebaikan, memberikan derajat dan wibawa lebih baik, memperoleh rahmat dan perlindungan malaikat, " +
                    "memberi syafaat di hari kiamat, hingga menghindarkan dari sesat dan celaka bagi pembacanya.",

            "Perilaku ghibah adalah perbuatan tercela yang dilarang keras oleh agama Islam. Membicarakan kejelekan dan keburukan orang lain disebut ghibah atau menggunjing. Ghibah dan fitnah, keduanya merupakan perilaku tercela. " +
                    "Hanya saja yang membedakan adalah benar atau tidaknya apa yang dibicarakan.Hai orang-orang yang beriman! Jauhilah prasangka, sesungguhnya sebagian prasangka itu adalah dosa dan janganlah kamu mencari-cari kesalahan orang" +
                    " lain dan janganlah ada di antara kamu yang menggunjing sebagian yang lain. Apakah ada di antara kamu yang suka memakan daging saudaranya yang sudah mati? Tentu kamu merasa jijik. Dan bertakwalah kepada Allah, sesungguhnya " +
                    "Allah Maha Penerima tobat, Maha Penyayang.",

            "Haji merupakan berasal dari bahasa Arab ‘hajj’ yang dalam bahasa Indonesia mengunjungi atau menuju. Namun banyak juga yang mengartikan kata haji sebagai ziarah islam tahunan. Ziarah tersebut dilakukan di kota Mekah, Arab, kota paling suci bagi umat Islam. " +
                    "Sesuai kesepakatan para ulama, menunaikan ibadah haji hukumnya wajib. Kewajiban haji telah dituangkan dalam Al Quran dan hadits. Adapun orang yang wajib menunaikan haji, harus memenuhi syarat wajib haji terlebih dahulu." +
                    "Secara istilah berarti menyengaja mengunjungi rumah Allah SWT (Ka’bah) untuk melaksanakan amal ibadah dengan syarat-syarat yang telah ditentukan pada waktu tertentu. Hukum ibadah haji itu wajib bagi umat muslim yang mampu secara finansial dan fisiknya.",

            "Rasulullah SAW bersabda: “Menuntut ilmu itu hukumnya wajib, bagi muslim laki-laki dan muslim perempuan" +
                    "Hadis di atas tentunya sudah tidak asing di benak kita, bahwa kewajiban menuntut ilmu itu diperuntukkan bagi setiap orang Islam. Ilmu adalah kekhususan, ilmu adalah keistimewaan yang Allah subhanahu wa ta’ala khususkan hanya untuk manusia semata. " +
                    "Selain ilmu, manusia dan hewan memiliki kesamaan. Ilmu dapat mengantarkan seseorang menuju kepada kebajikan dan ketaqwaan. Dan sebab ketaqwaan itu, seseorang dapat memperoleh kemuliaan di sisi Allah subhanahu wa ta’ala, dan kebahagiaan abadi.",

            "Al-Quran memerintahkan laki-laki dan perempuan untuk menutup aurat. Para ulama membedakan aurat untuk laki-laki dan perempuan. Bagi laki laki, aurat meliputi bagian tubuh yang berada di antara lutut dan pusar. " +
                    "Sedangkan untuk perempuan, aurat mencakup seluruh tubuh, kecuali muka dan kedua telapak tangan. Terkait dengan pakaian perempuan, secara khusus, Allah memerintahkan kepada mereka yang beriman untuk menahan pandangan dan kemaluan (QS.An-Nur, 24:31)",

            "Hari Raya Idul Adha atau yang biasa dikenal sebagai hari raya kurban akan segera tiba. Momen kurban menjadi kesempatan emas bagi umat muslim untuk mendapat pahala dan saling berbagi. Karena dengan berkurban juga sebagai salah satu cara beribadah dan bentuk syukur atas rezeki yang didapat." +
                    "Ibadah kurban hukumnya adalah sunnah muakkadah, yaitu ibadah yang sangat dianjurkan sekali (kuat). Berkurban memiliki banyak keistimewaan yang akan didapat. Berkurban sejatinya adalah media untuk mendekatkan diri kepada Allah SWT. Dengan berkurban, merupakan suatu bentuk kepatuhan dan ketaatan makhluk kepada sang pencipta.",

            "Sebagai seorang muslim, sholat 5 waktu merupakan kewajiban yang harus kita lakukan. Selain mendekatkan diri kepada Allah SWT, gerakan sholat juga memiliki manfaat kesehatan" +
                    "Sholat merupakan ibadah yang paling dicintai Allah SWT karena aktivitas sholat dapat mendekatkan diri kepada-Nya." +
                    "Tidak hanya untuk mendekatkan diri pada Allah, sholat juga bermandat untuk menenangkan hati, menyehatkan mental dan fisik secara keseluruhan.",

            "Islam tak hanya membahas hubungan antara Allah SWT dengan hamba-Nya saja. Islam juga menyoroti hubungan antara manusia dengan manusia lainnya. Salah satu yang ditekankan dalam ajaran Islam adalah ajaran untuk tolong menolong. tolong menolong dalam Islam disebut dengan ta’awun. Artinya adalah upaya untuk saling membantu, saling bersinergi antara satu pihak dengan pihak yang lain." +
                    "Manusia merupakan makhluk sosial yang tidak dapat hidup sendiri tanpa bantuan orang lain. Oleh karena itu, sikap saling tolong menolong sangat dibutuhkan untuk bisa menjalani kehidupan. ",

            "Zakat merupakan salah satu rukun Islam. Zakat adalah jumlah harta tertentu yang wajib dikeluarkan oleh orang yang beragama Islam dan diberikan kepada golongan yang berhak menerimanya (fakir miskin dan sebagainya) menurut ketentuan yang telah ditetapkan. Zakat merupakan rukun Islam yang ke-4. Terdapat dua macam zakat yang wajib diketahui para umat Islam, yaitu zakat fitrah dan zakat maal." +
                    "Zakat berasal dari kata \"zaka\" yang artinya suci, baik, berkah, tumbuh, dan berkembang. Di dalam zakat terkandung harapan untuk memperoleh keberkahan, kebersihan jiwa, dan memupuk kebaikan. Itulah mengapa disebut dengan zakat. Para ulama sepakat mengeluarkan zakat hukumnya wajib bagi setiap Muslim yang memenuhi syarat wajib zakat. Sebagaimana ketentuan dalam syariat agama.",

            "Rasulullah SAW sangat menganjurkan kepada umatnya untuk senantiasa menjaga kebersihan. Dengan menjaga kebersihan, tubuh kita akan sehat dan kuat. Dalam syariat islam, ketika mengerjakan shalat diwajibkan bagi umat islam agar bersih dari hadas dan najis, baik badan, pakaian, maupun tempat yang dipergunakan untuk shalat. Salah satu aspek kehidupan yang menjadi perhatian Islam adalah " +
                    "kesucian dan kebersihan. Selain kebersihan diri, kebersihan lingkungan juga penting dalam kelangsungan hidup makhluk Allah di bumi. Kebersihan lingkungan rumah kita sebagai tempat tinggal harus selalu dijaga dan dilestarikan. Karena rumah atau tempat tinggal mencerminkan penghuni rumah itu sendiri. Berdasarkan ajaran islam, rumah yang suci adalah rumah yang terawat dan bersih. " +
                    "Ketika kita tidak menjaga kebersihan lingkungan sekitar kita, maka sesuatu yang buruk akan terjadi. Penyakit dan wabah merajalela. Kesehatan jadi sesuatu yang sangat mahal harganya. Saat ini penyebaran penyakit dan virus merajalela. Hanya kita lah sebagai makhluk hidup dan manusia berakal yang dapat melakukan pencegahan dan perubahan ke arah yang lebih baik.",
    };
}
