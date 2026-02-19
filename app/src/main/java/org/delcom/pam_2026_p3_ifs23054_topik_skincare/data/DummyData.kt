package org.delcom.pam_2026_p3_ifs23054_topik_skincare.data

import org.delcom.pam_2026_p3_ifs23054_topik_skincare.R

object DummyData {
    fun getPlantsData(): List<PlantData> {
        return listOf(
            PlantData(
                nama = "acne gel",
                gambar = R.drawable.img_acne_gel,
                deskripsi = "Gel spot treatment untuk kulit berjerawat..",
                manfaat = "Mengurangi kemerahan jerawat\n" +
                        "\n" +
                        "Membantu mengeringkan jerawat\n" +
                        "\n" +
                        "Mengontrol minyak berlebih.",
                efekSamping = "Kulit kering & mengelupas\n" +
                        "\n" +
                        "Iritasi jika digunakan berlebihan."
            ),
            PlantData(
                nama = "anti aging",
                gambar = R.drawable.img_anti_aging,
                deskripsi = "Serum dengan fokus anti-aging dan elastisitas kulit..",
                manfaat = "Mengurangi garis halus.",
                efekSamping = "Reaksi ringan pada kulit sensitif."
            ),
            PlantData(
                nama = "brightening serum",
                gambar = R.drawable.img_brightening_serum,
                deskripsi = "Serum berwarna oranye dengan kandungan vitamin C untuk antioksidan dan brightening.",
                manfaat = "Antioksidan melawan radikal bebas.",
                efekSamping = "Iritasi jika dipakai bersamaan dengan AHA/BHA kuat."
            ),
            PlantData(
                nama = "clay mask",
                gambar = R.drawable.img_clay_mask,
                deskripsi = "Masker berbahan clay untuk deep cleansing dan brightening..",
                manfaat = "Membersihkan pori-pori.",
                efekSamping = "Kulit terasa kering."
            ),
            PlantData(
                nama = "Cleansing Foam",
                gambar = R.drawable.img_cleansing_foam,
                deskripsi = "Cleansing Foam adalah pembersih wajah berbentuk busa lembut yang efektif mengangkat kotoran, minyak, dan sisa makeup tanpa membuat kulit terasa kering.",
                manfaat = "Membersihkan pori-pori secara menyeluruh, membantu mengontrol minyak berlebih, menjaga keseimbangan pH kulit, serta membuat kulit terasa segar dan bersih.",
                efekSamping = "Pada kulit sensitif dapat menyebabkan rasa kering atau iritasi ringan, terutama jika mengandung surfaktan atau pewangi yang kuat."
            ),
            PlantData(
                nama = "Facial Toner",
                gambar = R.drawable.img_facial_toner,
                deskripsi = "Facial Toner adalah cairan perawatan wajah yang digunakan setelah mencuci muka untuk membantu membersihkan sisa kotoran serta menyeimbangkan pH kulit.",
                manfaat = "Menyegarkan dan menenangkan kulit, membantu mengecilkan tampilan pori-pori, mengontrol minyak berlebih, serta mempersiapkan kulit agar lebih optimal menyerap serum dan pelembap.",
                efekSamping = "Pada kulit sensitif dapat menyebabkan iritasi atau rasa perih ringan, terutama jika mengandung alkohol atau bahan aktif yang kuat."
            ),

            PlantData(
                nama = "Hydra Moisturizer",
                gambar = R.drawable.img_hydra_moisturizer,
                deskripsi = "Hydra Moisturizer adalah krim pelembap dengan tekstur lembut yang dirancang untuk memberikan hidrasi intens dan menjaga kelembapan kulit sepanjang hari.",
                manfaat = "Melembapkan kulit secara mendalam, membantu memperkuat skin barrier, mengurangi rasa kering dan kencang, serta membuat kulit terasa lebih halus dan kenyal.",
                efekSamping = "Pada kulit berminyak atau sensitif dapat terasa berat atau memicu komedo ringan jika digunakan berlebihan."
            ),

            PlantData(
                nama = "sunscreen",
                gambar = R.drawable.img_sunscreen,
                deskripsi = "Sunscreen dengan perlindungan tinggi terhadap UVA & UVB.",
                manfaat = "Melindungi dari sinar matahari\n" +
                        "\n" +
                        "Mencegah penuaan dini\n" +
                        "\n" +
                        "Mengurangi risiko hiperpigmentasi.",
                efekSamping = "White cast pada beberapa kulit\n" +
                        "\n" +
                        "Komedo jika formula terlalu berat."
            ),
            PlantData(
                nama = "Serum Vitamin C",
                gambar = R.drawable.img_serum_vit_c,
                deskripsi = "Serum Vitamin C adalah produk perawatan wajah dengan kandungan antioksidan tinggi yang membantu mencerahkan dan melindungi kulit dari paparan radikal bebas.",
                manfaat = "Membantu mencerahkan kulit kusam, menyamarkan noda hitam, merangsang produksi kolagen, serta melindungi kulit dari kerusakan akibat sinar matahari dan polusi.",
                efekSamping = "Pada kulit sensitif dapat menimbulkan rasa perih, kemerahan, atau iritasi ringan terutama jika konsentrasi vitamin C cukup tinggi."
            ),

            PlantData(
                nama = "Sheet Mask",
                gambar = R.drawable.img_sheet_mask,
                deskripsi = "Sheet Mask adalah masker wajah berbentuk lembaran yang direndam dalam essence untuk memberikan perawatan intensif dalam waktu singkat.",
                manfaat = "Memberikan hidrasi instan, membantu menenangkan kulit, membuat kulit terasa lebih segar dan lembut, serta meningkatkan kecerahan wajah.",
                efekSamping = "Jika digunakan terlalu lama atau tidak cocok dengan kandungannya dapat menyebabkan iritasi, kemerahan, atau munculnya jerawat ringan."
            ),
        )
    }
}