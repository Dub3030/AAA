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
 فئة تم اختبارها  بشكل عام TagExtractor {
    @ تم اختباره
     الاختبار النهائي العام TagExtractor (  ) { 
         مستخرج TagExtractor  النهائي = TagExtractor جديد ( null , 0 ); 
        AssureNull ( extractor . target );
        AssureEquals ( 0 , extractor . عتبة );
        Final  TagExtractor  extractor2 = new  TagExtractor ( "abstract" , 10 );
        AssurEquals ( " abstract" , extractor2 .target );
        AssureEquals ( 10 , extractor2 . عتبة );
    }
    @ اختبار
     اختبار الفراغ النهائي  العام SetTag () { 
         مستخرج TagExtractor  النهائي = TagExtractor جديد ( null , 0 ); 
        مستخرج . setTag ( "" );
        AssureEquals ( "" , extractor .tag ) ;
        مستخرج . setTag ( فارغة )؛
        AssureNull ( extractor .tag ) ;
    }
