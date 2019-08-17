#include <stdio.h>
#include <malloc.h>

struct node{
    int data;
    struct node *next;
};

struct node* head=NULL;
struct node* create(int);
void insert(struct node*,int);

int main()
{
    struct node* head=create(2);
    insert(head,3);
    insert(head,4);
    insert(head,5);
    delete(head);
    deletestart(head);
    display(head);
    return 0;
}
struct node* create(int dat){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=dat;
    newnode->next=NULL;
    return newnode;
}
void insert(struct node* head,int val){
    struct node* new = (struct node*)malloc(sizeof(struct node));
    new->data=val;
    new->next=NULL;
    struct node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=new;
}
void display(struct node*head){
    struct node* temp=head;
    while(temp!=NULL){
        printf("%d->",temp->data);
        temp=temp->next;
    }
}
void delete(struct node* head){
    struct node*temp1;
    struct node* temp=head;
    while(temp->next!=NULL){
        temp1=temp;
        temp=temp->next;
    }
    temp1->next=NULL;
    free(temp);
}


