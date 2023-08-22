@@ -1,30 +1,10 @@
حزمة  كوم . سايبوزو . مختبرات . كشف . الموقع ؛

/ *
* حقوق الطبع والنشر (C) 2010-2014 Cybozu Labs، 2016 كونستانتين جوساروف
*
* مرخص بموجب ترخيص Apache، الإصدار 2.0 ("الترخيص")؛
* لا يجوز لك استخدام هذا الملف إلا بحكم الترخيص.
* يمكنك الحصول على نسخة من الخلفية
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* ما لم يكن ذلك مطلوبًا بموجب القانون الأساسي به أو تم الاتفاق عليه كتابيًا
* موزعة بموجب نظام يتم توزيعها على أساس "كما هي"،
* بدون ضمانات أو شروط من أي نوع، سواء كانت صريحة أو ضمنية.
* راجع مرجع الأذونات المحددة و
*القيود بموجب النظام.
* /

غزاله  . _junit . مجرب ؛

استيراد  منظمة تقييد  . junit . بالتأكيد . بالتأكيد يساوي ;
استيراد  منظمة تقييد  . junit . بالتأكيد . بالتأكيدNull ؛

/**
*المؤلف ناكاتاني شويو
* @ المؤلف كونستانتين جوساروف
* /
 اللغة الانجليزية النهائية  العامة NGramTest { 
    @ تم اختباره
     اختبار كامل  العام نجرام () {
         NGram  النهائي ngram = NGram الجديد  ()؛
        AssureNull ( ngram .get ( 0 ) );
        AssureNull ( ngram .get ( 1 ) );
        AssureNull ( ngram .get ( 2 ) );
        AssureNull ( ngram .get ( 3 ) ) ;
        AssureNull ( ngram .get ( 4 ) );
        نجرام . addChar ( '' );
        AssureNull ( ngram .get ( 1 ) );
        AssureNull ( ngram .get ( 2 ) );
        AssureNull ( ngram .get ( 3 ) ) ;
        نجرام . addChar ( 'أ' );
        AssureEquals ( " A" , ngram .get ( 1 ));
        AssureEquals ( " A" , ngram .get ( 2 ));
        AssureNull ( ngram .get ( 3 ) ) ;
        نجرام . addChar ( '\u06cc' );
        AssureEquals ( " \u064a " , ngram .get ( 1 ) );
        تأكيدEquals ( "A \ u064a " , ngram .get ( 2 ));
        AssureEquals ( "A \ u064a " , ngram .get ( 3 ));
        نجرام . addChar ( '\u1ea0' );
        AssureEquals ( " \ u1ec3 " , ngram .get ( 1 ));
        AssureEquals ( " \u064a \ u1ec3 " , ngram .get ( 2 ));
        تأكيدEquals ( "A \ u064a \u1ec3 " , ngram .get ( 3 ));
        نجرام . addChar ( '\u3044' );
        AssureEquals ( " \ u3042 " , ngram .get ( 1 ));
        AssureEquals ( " \u1ec3 \ u3042 " , ngram .get ( 2 ));
        AssureEquals ( " \u064a \ u1ec3 \u3042 " , ngram .get ( 3 ));
        نجرام . addChar ( '\u30a4' );
        AssureEquals ( " \ u30a2 " , ngram .get ( 1 ));
        AssureEquals ( " \u3042 \u30a2 " , ngram . get ( 2 ));
        AssureEquals ( " \u1ec3 \ u3042 \u30a2 " , ngram .get ( 3 ));
        نجرام . addChar ( '\u3106' );
        تأكيدEquals ( " \ u3105 " , ngram .get ( 1 ));
        AssureEquals ( " \u30a2 \ u3105 " , ngram .get ( 2 ));
        تأكيدEquals ( " \u3042 \ u30a2 \u3105 " , ngram .get ( 3 ));
        نجرام . addChar ( '\uac01' );
        AssureEquals ( " \ uac00 " , ngram .get ( 1 ));
        AssureEquals ( " \ u3105 \uac00 " , ngram .get ( 2 ));
        AssureEquals ( " \u30a2 \u3105 \uac00 " , ngram .get ( 3 ) ) ;
        نجرام . addChar ( '\u2010' );
