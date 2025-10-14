struct node
{
    int data;
    struct node *link;/* data */
};
struct node *head;



void reverse{

struct node *prevnode, *currentnode, *nextnode;
prevnode=0;
currentnode=head;
nextnode =head;
while(nextnode!=0)
{
    nextnode= nextnode->link;
    currentnode ->link = prevnode;
    prevnode =currentnode;
    currentnode = nextnode;
}
head= prevnode;}