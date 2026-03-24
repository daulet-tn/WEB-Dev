import { Product } from '../models/product.model';

export const PRODUCTS: Product[] = [
  {
    id: 1,
    name: 'Наушники QCY Crossky Link T22 черный',
    description: 'Беспроводные наушники для повседневного использования. Подходят для звонков и музыки, удобная посадка.',
    price: 13990,
    rating: 4.7,
    images: [
      'assets/images/1_1.jpg',
      'assets/images/1_2.jpg',
      'assets/images/1_3.jpg',
      'assets/images/1_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/qcy-crossky-link-t22-chernyi-112329555/',
    categoryId: 3, // Headphones
    likes: 0,
  },
  {
    id: 2,
    name: 'Планшет CCIT Kids Tablet x Combo 7 дюйм 4 Гб/128 Гб голубой',
    description: 'Компактный power bank на каждый день. Удобно брать с собой в дорогу и на учебу.',
    price: 34998,
    rating: 4.5,
    images: [
      'assets/images/2_1.jpg',
      'assets/images/2_2.jpg',
      'assets/images/2_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/ccit-kids-tablet-x-combo-7-djuim-4-gb-128-gb-goluboi-115675238/?c=353220100',
    categoryId: 4, // Tablets (временно) или сделай отдельную категорию Accessories, но по заданию их ровно 4
    likes: 0,
  },
  {
    id: 3,
    name: 'Планшет Apple iPad A16 11 2025 Wi-Fi 11 дюйм 6 Гб/128 Гб серебристый',
    description: 'Ёмкий Apple iPad A16 11, 6 Гб/128 Гб  для нескольких устройств. Подходит для поездок и длительного использования.',
    price: 204823,
    rating: 4.6,
    images: [
      'assets/images/3_1.jpg',
      'assets/images/3_2.jpg',
      'assets/images/3_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/apple-ipad-a16-11-2025-wi-fi-11-djuim-6-gb-128-gb-serebristyi-138199634/?c=353220100',
    categoryId: 4, // временно
    likes: 0,
  },
  {
    id: 4,
    name: 'Наушники Realme Buds Air 5 Pro бежевый',
    description: 'TWS-наушники с качественным звуком. Подходят для музыки, учёбы и звонков.',
    price: 39990,
    rating: 4.9,
    images: [
      'assets/images/4_1.jpg',
      'assets/images/4_2.jpg',
      'assets/images/4_3.jpg',
      'assets/images/4_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/naushniki-realme-buds-air-5-pro-bezhevyi-115152645/',
    categoryId: 3, // Headphones
    likes: 0,
  },
  {
    id: 5,
    name: 'Планшет AIRSTAR G3000 pluse 10.1 дюйм 16 Гб/512 Гб черный',
    description: 'Универсальный power bank на 10000 мАч. Хватает на несколько зарядок телефона.',
    price: 38899,
    rating: 4.5,
    images: [
      'assets/images/5_1.jpg',
      'assets/images/5_2.jpg',
      'assets/images/5_3.jpg',
      'assets/images/5_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/airstar-g3000-pluse-10-1-djuim-16-gb-512-gb-chernyi-128606600/?c=353220100',
    categoryId: 4, // временно
    likes: 0,
  },
  {
    id: 6,
    name: 'Наушники S20 черный',
    description: 'Недорогие беспроводные наушники. Простое подключение, удобны для повседневных задач.',
    price: 5990,
    rating: 4.3,
    images: [
      'assets/images/6_1.jpg',
      'assets/images/6_2.jpg',
      'assets/images/6_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/naushniki-s20-chernyi-114727344/',
    categoryId: 3, // Headphones
    likes: 0,
  },
  {
    id: 7,
    name: 'Смартфон TP-LINK Neffos X20 32Gb черный',
    description: 'Базовый смартфон для связи и мессенджеров. Подходит для повседневного использования.',
    price: 29990,
    rating: 4.7,
    images: [
      'assets/images/7_1.jpg',
      'assets/images/7_2.jpg',
      'assets/images/7_1.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/tp-link-neffos-x20-32gb-chernyi-1005096/',
    categoryId: 1, // Smartphones
    likes: 0,
  },
  {
    id: 8,
    name: 'Ноутбук Lenovo Legion Slim 5 16APH8 16" / 16GB / SSD 1TB / DOS',
    description: 'Мощный ноутбук для игр и сложных задач. Большой экран, быстрый SSD и хорошая производительность.',
    price: 699990,
    rating: 4.8,
    images: [
      'assets/images/8_1.jpg',
      'assets/images/8_2.jpg',
      'assets/images/8_3.jpg',
      'assets/images/8_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/lenovo-legion-slim-5-16aph8-16-16-gb-ssd-1024-gb-dos-82y9001mrk-113140518/',
    categoryId: 2, // Laptops
    likes: 0,
  },
  {
    id: 9,
    name: 'Ноутбук ABEND TK-E157 15.6" / 16GB / SSD 512GB / Win 11 Pro',
    description: 'Универсальный ноутбук для учёбы и работы. Windows 11 Pro, SSD и 16 ГБ памяти.',
    price: 209990,
    rating: 4.4,
    images: [
      'assets/images/9_1.jpg',
      'assets/images/9_2.jpg',
      'assets/images/9_3.jpg',
      'assets/images/9_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/abend-tk-e157-15-6-16-gb-ssd-512-gb-win-11-pro-657879325-143182824/',
    categoryId: 2, // Laptops
    likes: 0,
  },
  {
    id: 10,
    name: 'Ноутбук ULTRON SMART N100 15.6" / 16GB / SSD 512GB / Win 11',
    description: 'Ноутбук для учёбы и повседневных задач. Большой экран, быстрый SSD и 16 ГБ ОЗУ.',
    price: 390000,
    rating: 4.6,
    images: [
      'assets/images/10_1.jpg',
      'assets/images/10_2.jpg',
      'assets/images/10_3.jpg',
      'assets/images/10_4.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/ultron-smart-n100-15-6-16-gb-ssd-512-gb-win-11-00330-80000-00000-aa831-136748512/',
    categoryId: 2, // Laptops
    likes: 0,
  },
    {
    id: 11,
    name: 'Смартфон Samsung Galaxy A07 6 ГБ/128 ГБ черный',
    description: 'Доступный смартфон для повседневных задач, соцсетей и обучения.',
    price: 68665,
    rating: 4.7,
    images: [
      'assets/images/11_1.jpg',
      'assets/images/11_2.jpg',
      'assets/images/11_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/samsung-galaxy-a07-6-gb-128-gb-chernyi-144817763/?c=750000000',
    categoryId: 1,
    likes: 0,
  },
  {
    id: 12,
    name: 'Xiaomi Redmi Note 14 + free gifts + 8 ГБ/256 ГБ черный',
    description: 'Cмартфон с хорошей камерой и батареей.',
    price: 249900,
    rating: 4.8,
    images: ['assets/images/12_1.jpg',
      'assets/images/12_2.jpg',
      'assets/images/12_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/xiaomi-redmi-note-14-redmi-watch-5-active-redmi-buds-6-play-podstavka-dlja-telefona-interfeisnyi-kabel-3-v-1-tripod-8-gb-256-gb-chernyi-140352368/?c=353220100',
    categoryId: 1,
    likes: 0,
  },
  {
    id: 13,
    name: 'Смартфон Apple iPhone 14 128Gb черный',
    description: 'Надёжный iPhone для фото, видео и повседневного использования.',
    price: 359507,
    rating: 4.9,
    images: ['assets/images/13_1.jpg',
      'assets/images/13_2.jpg',
      'assets/images/13_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/apple-iphone-14-128gb-chernyi-106363023/?c=353220100',
    categoryId: 1,
    likes: 0,
  },
  {
    id: 14,
    name: 'Смартфон Realme C75 NFC 8 ГБ/256 ГБ золотистый + подарок',
    description: 'Смартфон с большим экраном и хорошей автономностью.',
    price: 209990,
    rating: 4.6,
    images: ['assets/images/14_1.jpg',
      'assets/images/14_2.jpg',
      'assets/images/14_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/realme-c75-nfc-8-gb-256-gb-zolotistyi-podarok-137838567/?c=353220100',
    categoryId: 1,
    likes: 0,
  },

  {
    id: 15,
    name: 'Ноутбук HP 15s 15.6" / 16 Гб / SSD 512 Гб / Win 11 / 15s-eq2093ur / 5A9G3EA',
    description: 'Отличный ноутбук для учебы и офиса.',
    price: 327944,
    rating: 4.6,
    images: ['assets/images/15_1.jpg',
      'assets/images/15_2.jpg',
      'assets/images/15_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/hp-15s-15-6-16-gb-ssd-512-gb-win-11-15s-eq2093ur-5a9g3ea-104512459/?c=353220100',
    categoryId: 2,
    likes: 0,
  },
  {
    id: 16,
    name: 'Ноутбук ASUS VivoBook 15 X1504ZA-BQ1364W 15.6" / 16 Гб / SSD 512 Гб / Win 11 / 90NB1021-M02090',
    description: 'Лёгкий и удобный ноутбук для повседневных задач.',
    price: 309897,
    rating: 4.7,
    images: ['assets/images/16_1.jpg',
      'assets/images/16_2.jpg',
      'assets/images/16_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/asus-vivobook-15-x1504za-bq1364w-15-6-16-gb-ssd-512-gb-win-11-90nb1021-m02090-121433042/?c=353220100',
    categoryId: 2,
    likes: 0,
  },

  {
    id: 17,
    name: 'Наушники JBL Tune 510BT черный',
    description: 'Популярные Bluetooth наушники с чистым звуком.',
    price: 8999,
    rating: 4.8,
    images: ['assets/images/17_1.jpg',
      'assets/images/17_2.jpg',
      'assets/images/17_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/naushniki-jbl-tune-510bt-chernyi-101420081/?c=353220100',
    categoryId: 3,
    likes: 0,
  },
  {
    id: 18,
    name: 'Наушники Apple AirPods 3 белый',
    description: 'Классические беспроводные наушники Apple.',
    price: 64799,
    rating: 4.9,
    images: ['assets/images/18_1.jpg',
      'assets/images/18_2.jpg',
      'assets/images/18_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/apple-airpods-2-belyi-100456501/',
    categoryId: 3,
    likes: 0,
  },

  {
    id: 19,
    name: 'Планшет Samsung Galaxy Tab A9 LTE 8.7 дюйм 4 Гб/64 Гб серый',
    description: 'Планшет для учебы, видео и интернета.',
    price: 129990,
    rating: 4.6,
    images: ['assets/images/19_3.jpg',
      'assets/images/19_2.jpg',
      'assets/images/19_1.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/samsung-galaxy-tab-a9-lte-8-7-djuim-4-gb-64-gb-seryi-113807107/?c=353220100',
    categoryId: 4,
    likes: 0,
  },
  {
    id: 20,
    name: 'Планшет Xiaomi Redmi Pad 2 11 дюйм 8 Гб/256 Гб серый',
    description: 'Отличный планшет для просмотра фильмов и учебы.',
    price: 139990,
    rating: 4.7,
    images: ['assets/images/20.jpg',
      'assets/images/20_2.jpg',
      'assets/images/20_3.jpg'
    ],
    link: 'https://kaspi.kz/shop/p/xiaomi-redmi-pad-6-gb-128-gb-seryi-108509998/',
    categoryId: 4,
    likes: 0,
  }
];
;
