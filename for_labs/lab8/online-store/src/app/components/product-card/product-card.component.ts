import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';   // ✅ ДОБАВЬ
import { Product } from '../../models/product.model';

@Component({
  selector: 'app-product-card',
  standalone: true,
  imports: [CommonModule], // RouterModule не обязателен, если ты НЕ используешь routerLink в html
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css'],
})
export class ProductCardComponent {
  @Input() product!: Product;
  @Output() deleteProduct = new EventEmitter<number>();

  constructor(private router: Router) {}   // ✅ ДОБАВЬ

  openDetails() {                           // ✅ ДОБАВЬ
    this.router.navigate(['/product', this.product.id]);
  }

  liked = false;
  like() {
    this.liked = !this.liked;
    if (this.liked) this.product.likes++;
    else this.product.likes = Math.max(0, this.product.likes - 1);
  }

  delete() {
    console.log('CARD emit id:', this.product.id);
    this.deleteProduct.emit(this.product.id);
  }

  selectedImage = '';

  ngOnInit() {
    this.selectedImage = this.product.images[0];
  }

  setImage(img: string) {
    this.selectedImage = img;
  }

  openKaspi() {
    window.open(this.product.link, '_blank'); // внешний сайт — нормально
  }

  shareWhatsApp() {
    const text = `Check out this product: ${this.product.link}`;
    window.open(`https://wa.me/?text=${encodeURIComponent(text)}`, '_blank');
  }

  shareTelegram() {
    const url = `https://t.me/share/url?url=${encodeURIComponent(this.product.link)}&text=${encodeURIComponent(this.product.name)}`;
    window.open(url, '_blank');
  }

  stars(): number[] {
    const full = Math.round(this.product.rating);
    return Array.from({ length: 5 }, (_, i) => (i < full ? 1 : 0));
  }
}