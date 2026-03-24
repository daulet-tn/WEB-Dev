import { Component } from '@angular/core';
import { ProductListComponent } from './components/product-list/product-list.component';
import { Category } from './models/category.model';
import { Product } from './models/product.model';
import { ProductService } from './services/product.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, ProductListComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})


export class AppComponent {
  categories: Category[] = [];
  allProducts: Product[] = [];
  selectedCategoryId: number | null = null;

  constructor(private ps: ProductService) {
    this.categories = this.ps.getCategories();
    this.allProducts = this.ps.getProducts();
  }

selectCategory(id: number) {
  this.selectedCategoryId = id;
}
get filteredProducts(): Product[] {
  if (this.selectedCategoryId === null) return [];
  return this.allProducts.filter((p: Product) => p.categoryId === this.selectedCategoryId);
}

deleteProduct(id: number) {
  this.allProducts = this.allProducts.filter(p => p.id !== id);
}
}
