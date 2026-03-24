export interface Product {
  id: number;
  name: string;
  description: string;
  price: number;
  rating: number;

  images: string[];      // твоя галерея как в Lab 4
  link: string;

  categoryId: number;    // NEW
  likes: number;         // NEW (start 0)
}
