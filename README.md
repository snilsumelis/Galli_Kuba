# Galli ve Kuba Dönüşüm Uygulaması

Bu Java programı, Galli ve Kuba adında iki farklı para biriminin dönüşümünü sağlar. Program, `Galli` ve `Kuba` sınıflarını kullanarak bu dönüşümleri gerçekleştirir.

## Galli Sınıfı

- `Galli` sınıfı, Galli para birimini temsil eder.
- Galli para birimi, on tabanındaki sayıları temsil eder.
- Galli para birimine dönüştürme ve işlemler için metodlar içerir.
- `Galli` sınıfı, `Currency` (para miktarı) ve `Result` (dönüştürülmüş değer) alanlarına sahiptir.
- Galli para birimi, 9 tabanında ifade edilir.

## Kuba Sınıfı

- `Kuba` sınıfı, Kuba para birimini temsil eder.
- Kuba para birimi, yedi tabanındaki sayıları temsil eder.
- Kuba para birimine dönüştürme ve işlemler için metodlar içerir.
- `Kuba` sınıfı, `Currency` (para miktarı) ve `Result` (dönüştürülmüş değer) alanlarına sahiptir.
- Kuba para birimi, 7 tabanında ifade edilir.

## İşlevler ve Kullanım

- Her iki sınıf da para birimi dönüşümlerini gerçekleştirmek için `Add`, `Subtract`, `Convert` ve `GetCurrency` gibi metodları içerir.
- Kullanıcı, para birimi miktarını girdikten sonra ilgili dönüşümü gerçekleştirebilir.
- Para birimi miktarı, geçerli bir para birimi değerine sahip olmalıdır.
- Dönüşüm sonuçları ekrana veya dosyaya yazdırılır.
