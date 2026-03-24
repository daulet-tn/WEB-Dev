from django.http import JsonResponse
from .models import Product, Category

def products_list(request):
    products = Product.objects.all().values(
        'id', 'name', 'price', 'description', 'count', 'is_active', 'category_id'
    )
    return JsonResponse(list(products), safe=False)

def product_detail(request, id):
    try:
        product = Product.objects.filter(id=id).values(
            'id', 'name', 'price', 'description', 'count', 'is_active', 'category_id'
        ).first()
        if product is None:
            return JsonResponse({'error': 'Not found'}, status=404)
        return JsonResponse(product)
    except Exception as e:
        return JsonResponse({'error': str(e)}, status=500)

def categories_list(request):
    categories = Category.objects.all().values('id', 'name')
    return JsonResponse(list(categories), safe=False)

def category_detail(request, id):
    try:
        category = Category.objects.filter(id=id).values('id', 'name').first()
        if category is None:
            return JsonResponse({'error': 'Not found'}, status=404)
        return JsonResponse(category)
    except Exception as e:
        return JsonResponse({'error': str(e)}, status=500)

def category_products(request, id):
    products = Product.objects.filter(category_id=id).values(
        'id', 'name', 'price', 'description', 'count', 'is_active', 'category_id'
    )
    return JsonResponse(list(products), safe=False)