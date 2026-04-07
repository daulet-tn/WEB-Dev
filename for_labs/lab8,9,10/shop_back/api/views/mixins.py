from rest_framework import generics, mixins
from rest_framework.views import APIView
from rest_framework.response import Response
from ..models import Product, Category
from ..serializers import ProductSerializer, CategorySerializer

# Продукты
class ProductListAPIView(mixins.ListModelMixin,
                         mixins.CreateModelMixin,
                         generics.GenericAPIView):
    queryset = Product.objects.all()
    serializer_class = ProductSerializer

    def get(self, request):
        return self.list(request)

    def post(self, request):
        return self.create(request)


class ProductDetailAPIView(mixins.RetrieveModelMixin,
                           mixins.UpdateModelMixin,
                           mixins.DestroyModelMixin,
                           generics.GenericAPIView):
    queryset = Product.objects.all()
    serializer_class = ProductSerializer
    lookup_url_kwarg = 'product_id'

    def get(self, request, product_id):
        return self.retrieve(request, pk=product_id)

    def put(self, request, product_id):
        return self.update(request, pk=product_id)

    def delete(self, request, product_id):
        return self.destroy(request, pk=product_id)


# Категорий 
class CategoryListAPIView(mixins.ListModelMixin,
                          mixins.CreateModelMixin,
                          generics.GenericAPIView):
    queryset = Category.objects.all()
    serializer_class = CategorySerializer

    def get(self, request):
        return self.list(request)

    def post(self, request):
        return self.create(request)


class CategoryDetailAPIView(mixins.RetrieveModelMixin,
                            mixins.UpdateModelMixin,
                            mixins.DestroyModelMixin,
                            generics.GenericAPIView):
    queryset = Category.objects.all()
    serializer_class = CategorySerializer
    lookup_url_kwarg = 'category_id'

    def get(self, request, category_id):
        return self.retrieve(request, pk=category_id)

    def put(self, request, category_id):
        return self.update(request, pk=category_id)

    def delete(self, request, category_id):
        return self.destroy(request, pk=category_id)


class CategoryProductsAPIView(APIView):
    def get(self, request, category_id):
        products = Product.objects.filter(category__id=category_id)
        serializer = ProductSerializer(products, many=True)
        return Response(serializer.data)